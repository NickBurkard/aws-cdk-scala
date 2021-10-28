package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JenkinsProvider {

  def apply(
    internalResourceId: String,
    serverUrl: Option[String] = None,
    forBuild: Option[Boolean] = None,
    forTest: Option[Boolean] = None,
    version: Option[String] = None,
    providerName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider =
    software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.Builder
      .create(stackCtx, internalResourceId)
      .serverUrl(serverUrl.orNull)
      .forBuild(forBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .forTest(forTest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .providerName(providerName.orNull)
      .build()
}
