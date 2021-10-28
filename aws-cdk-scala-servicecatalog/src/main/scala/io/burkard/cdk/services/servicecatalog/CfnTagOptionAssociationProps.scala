package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTagOptionAssociationProps {

  def apply(
    resourceId: Option[String] = None,
    tagOptionId: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps.Builder)
      .resourceId(resourceId.orNull)
      .tagOptionId(tagOptionId.orNull)
      .build()
}
