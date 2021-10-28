package io.burkard.cdk.services.ecr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RepositoryProps {

  def apply(
    repositoryName: Option[String] = None,
    lifecycleRules: Option[List[_ <: software.amazon.awscdk.services.ecr.LifecycleRule]] = None,
    imageScanOnPush: Option[Boolean] = None,
    imageTagMutability: Option[software.amazon.awscdk.services.ecr.TagMutability] = None,
    lifecycleRegistryId: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.ecr.RepositoryProps =
    (new software.amazon.awscdk.services.ecr.RepositoryProps.Builder)
      .repositoryName(repositoryName.orNull)
      .lifecycleRules(lifecycleRules.map(_.asJava).orNull)
      .imageScanOnPush(imageScanOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .imageTagMutability(imageTagMutability.orNull)
      .lifecycleRegistryId(lifecycleRegistryId.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
