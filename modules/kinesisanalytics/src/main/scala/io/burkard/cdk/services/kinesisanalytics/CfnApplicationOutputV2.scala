package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationOutputV2 {

  def apply(
    internalResourceId: String,
    applicationName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName.orNull)
      .output(output.orNull)
      .build()
}
