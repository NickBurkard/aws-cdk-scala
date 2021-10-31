package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelPackageGroupProps {

  def apply(
    modelPackageGroupName: Option[String] = None,
    modelPackageGroupPolicy: Option[AnyRef] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    modelPackageGroupDescription: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps =
    (new software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps.Builder)
      .modelPackageGroupName(modelPackageGroupName.orNull)
      .modelPackageGroupPolicy(modelPackageGroupPolicy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .modelPackageGroupDescription(modelPackageGroupDescription.orNull)
      .build()
}
