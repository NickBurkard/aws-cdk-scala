package io.burkard.cdk.services.codepipeline


sealed abstract class S3Trigger(val underlying: software.amazon.awscdk.services.codepipeline.actions.S3Trigger)
  extends Product
    with Serializable


object S3Trigger {
  implicit def toAws(value: S3Trigger): software.amazon.awscdk.services.codepipeline.actions.S3Trigger =
    Option(value).map(_.underlying).orNull

  case object None
    extends S3Trigger(software.amazon.awscdk.services.codepipeline.actions.S3Trigger.NONE)

  case object Poll
    extends S3Trigger(software.amazon.awscdk.services.codepipeline.actions.S3Trigger.POLL)

  case object Events
    extends S3Trigger(software.amazon.awscdk.services.codepipeline.actions.S3Trigger.EVENTS)
}
