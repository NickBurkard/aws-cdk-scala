package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
