package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationVersionProps {

  def apply(
    applicationName: String,
    sourceBundle: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty,
    description: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder)
      .applicationName(applicationName)
      .sourceBundle(sourceBundle)
      .description(description.orNull)
      .build()
}
