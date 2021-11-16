package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JenkinsProviderProps {

  def apply(
    serverUrl: String,
    providerName: String,
    forBuild: Option[Boolean] = None,
    forTest: Option[Boolean] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps =
    (new software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps.Builder)
      .serverUrl(serverUrl)
      .providerName(providerName)
      .forBuild(forBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .forTest(forTest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .build()
}
