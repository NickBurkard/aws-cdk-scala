package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JenkinsProviderProps {

  def apply(
    serverUrl: Option[String] = None,
    forBuild: Option[Boolean] = None,
    forTest: Option[Boolean] = None,
    version: Option[String] = None,
    providerName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps =
    (new software.amazon.awscdk.services.codepipeline.actions.JenkinsProviderProps.Builder)
      .serverUrl(serverUrl.orNull)
      .forBuild(forBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .forTest(forTest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .providerName(providerName.orNull)
      .build()
}
