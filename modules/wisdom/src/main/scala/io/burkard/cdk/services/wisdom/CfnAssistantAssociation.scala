package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssistantAssociation {

  def apply(
    internalResourceId: String,
    assistantId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    associationType: Option[String] = None,
    association: Option[software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation =
    software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.Builder
      .create(stackCtx, internalResourceId)
      .assistantId(assistantId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .associationType(associationType.orNull)
      .association(association.orNull)
      .build()
}
