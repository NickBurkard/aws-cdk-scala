package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelClientOptions {

  def apply(
    invocationsMaxRetries: Option[Number] = None,
    invocationsTimeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions.Builder)
      .invocationsMaxRetries(invocationsMaxRetries.orNull)
      .invocationsTimeout(invocationsTimeout.orNull)
      .build()
}
