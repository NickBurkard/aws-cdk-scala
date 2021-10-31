package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnModelPackageGroup {

  def apply(
    internalResourceId: String,
    modelPackageGroupName: Option[String] = None,
    modelPackageGroupPolicy: Option[AnyRef] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    modelPackageGroupDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup =
    software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup.Builder
      .create(stackCtx, internalResourceId)
      .modelPackageGroupName(modelPackageGroupName.orNull)
      .modelPackageGroupPolicy(modelPackageGroupPolicy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .modelPackageGroupDescription(modelPackageGroupDescription.orNull)
      .build()
}
