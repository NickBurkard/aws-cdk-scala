package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JenkinsProviderAttributes {

  def apply(
    serverUrl: Option[String] = None,
    version: Option[String] = None,
    providerName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes =
    (new software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes.Builder)
      .serverUrl(serverUrl.orNull)
      .version(version.orNull)
      .providerName(providerName.orNull)
      .build()
}
