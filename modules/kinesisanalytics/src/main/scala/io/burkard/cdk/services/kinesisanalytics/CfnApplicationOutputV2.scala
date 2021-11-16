package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationOutputV2 {

  def apply(
    internalResourceId: String,
    applicationName: String,
    output: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 =
    software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName)
      .output(output)
      .build()
}
