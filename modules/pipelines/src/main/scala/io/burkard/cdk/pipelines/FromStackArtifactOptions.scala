package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FromStackArtifactOptions {

  def apply(
    prepareRunOrder: Option[Number] = None,
    outputFileName: Option[String] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    executeRunOrder: Option[Number] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.pipelines.FromStackArtifactOptions =
    (new software.amazon.awscdk.pipelines.FromStackArtifactOptions.Builder)
      .prepareRunOrder(prepareRunOrder.orNull)
      .outputFileName(outputFileName.orNull)
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .executeRunOrder(executeRunOrder.orNull)
      .output(output.orNull)
      .build()
}
