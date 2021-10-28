package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnImageProps {

  def apply(
    imageDisplayName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    imageDescription: Option[String] = None,
    imageName: Option[String] = None,
    imageRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnImageProps =
    (new software.amazon.awscdk.services.sagemaker.CfnImageProps.Builder)
      .imageDisplayName(imageDisplayName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .imageDescription(imageDescription.orNull)
      .imageName(imageName.orNull)
      .imageRoleArn(imageRoleArn.orNull)
      .build()
}
