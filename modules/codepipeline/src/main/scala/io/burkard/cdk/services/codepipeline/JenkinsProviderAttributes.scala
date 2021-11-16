package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JenkinsProviderAttributes {

  def apply(
    serverUrl: String,
    providerName: String,
    version: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes =
    (new software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderAttributes.Builder)
      .serverUrl(serverUrl)
      .providerName(providerName)
      .version(version.orNull)
      .build()
}
