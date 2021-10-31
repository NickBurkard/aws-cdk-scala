package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Repository {

  def apply(
    internalResourceId: String,
    repositoryName: Option[String] = None,
    lifecycleRules: Option[List[_ <: software.amazon.awscdk.services.ecr.LifecycleRule]] = None,
    imageScanOnPush: Option[Boolean] = None,
    imageTagMutability: Option[software.amazon.awscdk.services.ecr.TagMutability] = None,
    lifecycleRegistryId: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.Repository =
    software.amazon.awscdk.services.ecr.Repository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName.orNull)
      .lifecycleRules(lifecycleRules.map(_.asJava).orNull)
      .imageScanOnPush(imageScanOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .imageTagMutability(imageTagMutability.orNull)
      .lifecycleRegistryId(lifecycleRegistryId.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
