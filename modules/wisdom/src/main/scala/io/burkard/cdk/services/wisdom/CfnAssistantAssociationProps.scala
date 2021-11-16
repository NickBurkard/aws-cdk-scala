package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssistantAssociationProps {

  def apply(
    assistantId: String,
    associationType: String,
    association: software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps =
    (new software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps.Builder)
      .assistantId(assistantId)
      .associationType(associationType)
      .association(association)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
