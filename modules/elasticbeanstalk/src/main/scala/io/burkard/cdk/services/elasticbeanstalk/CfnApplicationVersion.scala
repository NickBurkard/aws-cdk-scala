package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationVersion {

  def apply(
    internalResourceId: String,
    applicationName: String,
    sourceBundle: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion =
    software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName)
      .sourceBundle(sourceBundle)
      .description(description.orNull)
      .build()
}
