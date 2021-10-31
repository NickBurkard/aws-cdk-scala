package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SsmAssociationProperty {

  def apply(
    documentName: Option[String] = None,
    associationParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty.Builder)
      .documentName(documentName.orNull)
      .associationParameters(associationParameters.map(_.asJava).orNull)
      .build()
}
