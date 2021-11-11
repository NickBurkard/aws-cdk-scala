package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssistantAssociationProps {

  def apply(
    assistantId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    associationType: Option[String] = None,
    association: Option[software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty] = None
  ): software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps =
    (new software.amazon.awscdk.services.wisdom.CfnAssistantAssociationProps.Builder)
      .assistantId(assistantId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .associationType(associationType.orNull)
      .association(association.orNull)
      .build()
}
