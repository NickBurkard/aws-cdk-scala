package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CdkStackActionFromArtifactOptions {

  def apply(
    prepareRunOrder: Option[Number] = None,
    baseActionName: Option[String] = None,
    outputFileName: Option[String] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    executeRunOrder: Option[Number] = None,
    stackName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    changeSetName: Option[String] = None
  ): software.amazon.awscdk.pipelines.CdkStackActionFromArtifactOptions =
    (new software.amazon.awscdk.pipelines.CdkStackActionFromArtifactOptions.Builder)
      .prepareRunOrder(prepareRunOrder.orNull)
      .baseActionName(baseActionName.orNull)
      .outputFileName(outputFileName.orNull)
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .executeRunOrder(executeRunOrder.orNull)
      .stackName(stackName.orNull)
      .output(output.orNull)
      .changeSetName(changeSetName.orNull)
      .build()
}
