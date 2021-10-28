package io.burkard.cdk.services.ecr

sealed abstract class TagMutability(val underlying: software.amazon.awscdk.services.ecr.TagMutability)
  extends Product
    with Serializable

object TagMutability {
  implicit def toAws(value: TagMutability): software.amazon.awscdk.services.ecr.TagMutability =
    Option(value).map(_.underlying).orNull

  case object Mutable
    extends TagMutability(software.amazon.awscdk.services.ecr.TagMutability.MUTABLE)

  case object Immutable
    extends TagMutability(software.amazon.awscdk.services.ecr.TagMutability.IMMUTABLE)
}
