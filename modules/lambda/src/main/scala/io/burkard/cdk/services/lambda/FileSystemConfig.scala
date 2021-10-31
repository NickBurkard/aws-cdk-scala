package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileSystemConfig {

  def apply(
    arn: Option[String] = None,
    dependency: Option[List[_ <: software.constructs.IDependable]] = None,
    localMountPath: Option[String] = None,
    connections: Option[software.amazon.awscdk.services.ec2.Connections] = None,
    policies: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None
  ): software.amazon.awscdk.services.lambda.FileSystemConfig =
    (new software.amazon.awscdk.services.lambda.FileSystemConfig.Builder)
      .arn(arn.orNull)
      .dependency(dependency.map(_.asJava).orNull)
      .localMountPath(localMountPath.orNull)
      .connections(connections.orNull)
      .policies(policies.map(_.asJava).orNull)
      .build()
}
