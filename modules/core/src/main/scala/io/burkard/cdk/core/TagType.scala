package io.burkard.cdk.core


sealed abstract class TagType(val underlying: software.amazon.awscdk.TagType)
  extends Product
    with Serializable


object TagType {
  implicit def toAws(value: TagType): software.amazon.awscdk.TagType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends TagType(software.amazon.awscdk.TagType.STANDARD)

  case object AutoscalingGroup
    extends TagType(software.amazon.awscdk.TagType.AUTOSCALING_GROUP)

  case object Map
    extends TagType(software.amazon.awscdk.TagType.MAP)

  case object KeyValue
    extends TagType(software.amazon.awscdk.TagType.KEY_VALUE)

  case object NotTaggable
    extends TagType(software.amazon.awscdk.TagType.NOT_TAGGABLE)
}
