package io.burkard.cdk.services.ecr


sealed abstract class TagStatus(val underlying: software.amazon.awscdk.services.ecr.TagStatus)
  extends Product
    with Serializable


object TagStatus {
  implicit def toAws(value: TagStatus): software.amazon.awscdk.services.ecr.TagStatus =
    Option(value).map(_.underlying).orNull

  case object Any
    extends TagStatus(software.amazon.awscdk.services.ecr.TagStatus.ANY)

  case object Tagged
    extends TagStatus(software.amazon.awscdk.services.ecr.TagStatus.TAGGED)

  case object Untagged
    extends TagStatus(software.amazon.awscdk.services.ecr.TagStatus.UNTAGGED)
}
