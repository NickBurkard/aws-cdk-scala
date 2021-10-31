package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnConfigurationSet =
    software.amazon.awscdk.services.ses.CfnConfigurationSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .build()
}
