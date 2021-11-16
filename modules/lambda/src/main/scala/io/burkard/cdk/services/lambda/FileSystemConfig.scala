package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemConfig {

  def apply(
    arn: String,
    localMountPath: String,
    dependency: Option[List[_ <: software.constructs.IDependable]] = None,
    connections: Option[software.amazon.awscdk.services.ec2.Connections] = None,
    policies: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None
  ): software.amazon.awscdk.services.lambda.FileSystemConfig =
    (new software.amazon.awscdk.services.lambda.FileSystemConfig.Builder)
      .arn(arn)
      .localMountPath(localMountPath)
      .dependency(dependency.map(_.asJava).orNull)
      .connections(connections.orNull)
      .policies(policies.map(_.asJava).orNull)
      .build()
}
