package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTagOptionAssociationProps {

  def apply(
    resourceId: String,
    tagOptionId: String
  ): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps.Builder)
      .resourceId(resourceId)
      .tagOptionId(tagOptionId)
      .build()
}
