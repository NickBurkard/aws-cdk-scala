package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FromStackArtifactOptions {

  def apply(
    cloudAssemblyInput: software.amazon.awscdk.services.codepipeline.Artifact,
    prepareRunOrder: Option[Number] = None,
    outputFileName: Option[String] = None,
    executeRunOrder: Option[Number] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.pipelines.FromStackArtifactOptions =
    (new software.amazon.awscdk.pipelines.FromStackArtifactOptions.Builder)
      .cloudAssemblyInput(cloudAssemblyInput)
      .prepareRunOrder(prepareRunOrder.orNull)
      .outputFileName(outputFileName.orNull)
      .executeRunOrder(executeRunOrder.orNull)
      .output(output.orNull)
      .build()
}
