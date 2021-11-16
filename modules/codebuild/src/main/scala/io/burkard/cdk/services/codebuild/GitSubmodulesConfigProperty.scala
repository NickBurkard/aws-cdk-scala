package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitSubmodulesConfigProperty {

  def apply(
    fetchSubmodules: Boolean
  ): software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder)
      .fetchSubmodules(fetchSubmodules)
      .build()
}
