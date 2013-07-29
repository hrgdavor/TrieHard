/* 
 * NOTICE OF LICENSE
 * 
 * This source file is subject to the Open Software License (OSL 3.0) that is 
 * bundled with this package in the file LICENSE.txt. It is also available 
 * through the world-wide-web at http://opensource.org/licenses/osl-3.0.php
 * If you did not receive a copy of the license and are unable to obtain it 
 * through the world-wide-web, please send an email to magnos.software@gmail.com 
 * so we can send you a copy immediately. If you use any of this software please
 * notify me via our website or email, your feedback is much appreciated. 
 * 
 * @copyright   Copyright (c) 2011 Magnos Software (http://www.magnos.org)
 * @license     http://opensource.org/licenses/osl-3.0.php
 *              Open Software License (OSL 3.0)
 */

package org.magnos.trie;

/**
 * A simple iterator for traversing the entries in a Trie. A node has a
 * sequence, an index in the overall sequence, a value, and a depth in the
 * Trie.
 * 
 * @author Philip Diffenderfer
 * 
 * @param <S>
 *        The sequence/key type.
 * @param <T>
 *        The value type.
 */
public interface TrieIterator<S, T>
{

   /**
    * A method invoked for each entry in a Trie.
    * 
    * @param sequence
    *        The sequence for the current entry.
    * @param index
    *        The index of the sequence in it's overall sequence.
    * @param value
    *        The value for the current entry.
    * @param depth
    *        The depth of the entry in the Trie.
    */
   public void onEntry( S sequence, int index, T value, int depth );

}
