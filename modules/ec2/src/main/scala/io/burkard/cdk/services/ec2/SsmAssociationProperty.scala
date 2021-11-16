package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SsmAssociationProperty {

  def apply(
    documentName: String,
    associationParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.SsmAssociationProperty.Builder)
      .documentName(documentName)
      .associationParameters(associationParameters.map(_.asJava).orNull)
      .build()
}
