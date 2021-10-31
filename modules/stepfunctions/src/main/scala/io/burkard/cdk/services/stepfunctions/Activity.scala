package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Activity {

  def apply(
    internalResourceId: String,
    activityName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Activity =
    software.amazon.awscdk.services.stepfunctions.Activity.Builder
      .create(stackCtx, internalResourceId)
      .activityName(activityName.orNull)
      .build()
}
