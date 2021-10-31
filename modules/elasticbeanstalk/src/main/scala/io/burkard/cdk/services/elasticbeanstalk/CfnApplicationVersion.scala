package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationVersion {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    applicationName: Option[String] = None,
    sourceBundle: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion =
    software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .applicationName(applicationName.orNull)
      .sourceBundle(sourceBundle.orNull)
      .build()
}
