package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDevEndpoint {

  def apply(
    internalResourceId: String,
    tags: Option[AnyRef] = None,
    securityGroupIds: Option[List[String]] = None,
    publicKeys: Option[List[String]] = None,
    securityConfiguration: Option[String] = None,
    publicKey: Option[String] = None,
    endpointName: Option[String] = None,
    glueVersion: Option[String] = None,
    arguments: Option[AnyRef] = None,
    numberOfWorkers: Option[Number] = None,
    numberOfNodes: Option[Number] = None,
    extraJarsS3Path: Option[String] = None,
    subnetId: Option[String] = None,
    extraPythonLibsS3Path: Option[String] = None,
    roleArn: Option[String] = None,
    workerType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnDevEndpoint =
    software.amazon.awscdk.services.glue.CfnDevEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .publicKeys(publicKeys.map(_.asJava).orNull)
      .securityConfiguration(securityConfiguration.orNull)
      .publicKey(publicKey.orNull)
      .endpointName(endpointName.orNull)
      .glueVersion(glueVersion.orNull)
      .arguments(arguments.orNull)
      .numberOfWorkers(numberOfWorkers.orNull)
      .numberOfNodes(numberOfNodes.orNull)
      .extraJarsS3Path(extraJarsS3Path.orNull)
      .subnetId(subnetId.orNull)
      .extraPythonLibsS3Path(extraPythonLibsS3Path.orNull)
      .roleArn(roleArn.orNull)
      .workerType(workerType.orNull)
      .build()
}