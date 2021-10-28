package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActivityProps {

  def apply(
    activityName: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.ActivityProps =
    (new software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder)
      .activityName(activityName.orNull)
      .build()
}
