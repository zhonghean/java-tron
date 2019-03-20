package org.tron.common.zksnark.sapling.note;

import org.tron.common.zksnark.sapling.address.PaymentAddress;
import org.tron.common.zksnark.sapling.note.BaseNote.Note;
import org.tron.common.zksnark.sapling.transaction.BaseOutPoint.OutPoint;

public class NoteEntry {

  /**
   * Sapling note, its location in a transaction, and number of confirmations.
   */
  public OutPoint op;

  public PaymentAddress address;
  public Note note;
  public char[] memo; // ZC_MEMO_SIZE
  public int confirmations;
}
