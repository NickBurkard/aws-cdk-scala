package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTagOptionAssociation {

  def apply(
    internalResourceId: String,
    resourceId: Option[String] = None,
    tagOptionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation =
    software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId.orNull)
      .tagOptionId(tagOptionId.orNull)
      .build()
}
