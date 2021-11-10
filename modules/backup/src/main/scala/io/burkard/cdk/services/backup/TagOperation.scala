package io.burkard.cdk.services.backup


sealed abstract class TagOperation(val underlying: software.amazon.awscdk.services.backup.TagOperation)
  extends Product
    with Serializable


object TagOperation {
  implicit def toAws(value: TagOperation): software.amazon.awscdk.services.backup.TagOperation =
    Option(value).map(_.underlying).orNull

  case object StringEquals
    extends TagOperation(software.amazon.awscdk.services.backup.TagOperation.STRING_EQUALS)

  case object Dummy
    extends TagOperation(software.amazon.awscdk.services.backup.TagOperation.DUMMY)
}
