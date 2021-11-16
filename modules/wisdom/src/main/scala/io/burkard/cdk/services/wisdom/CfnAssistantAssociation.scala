package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssistantAssociation {

  def apply(
    internalResourceId: String,
    assistantId: String,
    associationType: String,
    association: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation =
    software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.Builder
      .create(stackCtx, internalResourceId)
      .assistantId(assistantId)
      .associationType(associationType)
      .association(association)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
