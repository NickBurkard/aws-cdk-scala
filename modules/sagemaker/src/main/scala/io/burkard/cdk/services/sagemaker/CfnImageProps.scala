package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageProps {

  def apply(
    imageName: String,
    imageRoleArn: String,
    imageDisplayName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    imageDescription: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnImageProps =
    (new software.amazon.awscdk.services.sagemaker.CfnImageProps.Builder)
      .imageName(imageName)
      .imageRoleArn(imageRoleArn)
      .imageDisplayName(imageDisplayName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .imageDescription(imageDescription.orNull)
      .build()
}
