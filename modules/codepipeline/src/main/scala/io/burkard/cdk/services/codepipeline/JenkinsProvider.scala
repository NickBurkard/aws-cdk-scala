package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JenkinsProvider {

  def apply(
    internalResourceId: String,
    serverUrl: String,
    providerName: String,
    forBuild: Option[Boolean] = None,
    forTest: Option[Boolean] = None,
    version: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider =
    software.amazon.awscdk.services.codepipeline.actions.JenkinsProvider.Builder
      .create(stackCtx, internalResourceId)
      .serverUrl(serverUrl)
      .providerName(providerName)
      .forBuild(forBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .forTest(forTest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .build()
}
