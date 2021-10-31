package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnImage {

  def apply(
    internalResourceId: String,
    imageDisplayName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    imageDescription: Option[String] = None,
    imageName: Option[String] = None,
    imageRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnImage =
    software.amazon.awscdk.services.sagemaker.CfnImage.Builder
      .create(stackCtx, internalResourceId)
      .imageDisplayName(imageDisplayName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .imageDescription(imageDescription.orNull)
      .imageName(imageName.orNull)
      .imageRoleArn(imageRoleArn.orNull)
      .build()
}
