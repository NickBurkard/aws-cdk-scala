package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActivityProps {

  def apply(
    activityName: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.ActivityProps =
    (new software.amazon.awscdk.services.stepfunctions.ActivityProps.Builder)
      .activityName(activityName.orNull)
      .build()
}
