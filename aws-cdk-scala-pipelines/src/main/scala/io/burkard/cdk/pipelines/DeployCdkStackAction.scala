package io.burkard.cdk.pipelines

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeployCdkStackAction {

  def apply(
    prepareRunOrder: Option[Number] = None,
    baseActionName: Option[String] = None,
    outputFileName: Option[String] = None,
    stackArtifactId: Option[String] = None,
    templateConfigurationPath: Option[String] = None,
    actionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    cloudAssemblyInput: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    cloudFormationExecutionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    stackName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    changeSetName: Option[String] = None,
    templatePath: Option[String] = None,
    dependencyStackArtifactIds: Option[List[String]] = None,
    region: Option[String] = None,
    executeRunOrder: Option[Number] = None
  ): software.amazon.awscdk.pipelines.DeployCdkStackAction =
    software.amazon.awscdk.pipelines.DeployCdkStackAction.Builder
      .create()
      .prepareRunOrder(prepareRunOrder.orNull)
      .baseActionName(baseActionName.orNull)
      .outputFileName(outputFileName.orNull)
      .stackArtifactId(stackArtifactId.orNull)
      .templateConfigurationPath(templateConfigurationPath.orNull)
      .actionRole(actionRole.orNull)
      .cloudAssemblyInput(cloudAssemblyInput.orNull)
      .cloudFormationExecutionRole(cloudFormationExecutionRole.orNull)
      .stackName(stackName.orNull)
      .output(output.orNull)
      .changeSetName(changeSetName.orNull)
      .templatePath(templatePath.orNull)
      .dependencyStackArtifactIds(dependencyStackArtifactIds.map(_.asJava).orNull)
      .region(region.orNull)
      .executeRunOrder(executeRunOrder.orNull)
      .build()
}
