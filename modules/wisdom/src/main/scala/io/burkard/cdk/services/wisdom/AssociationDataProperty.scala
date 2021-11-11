package io.burkard.cdk.services.wisdom

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssociationDataProperty {

  def apply(
    knowledgeBaseId: Option[String] = None
  ): software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty =
    (new software.amazon.awscdk.services.wisdom.CfnAssistantAssociation.AssociationDataProperty.Builder)
      .knowledgeBaseId(knowledgeBaseId.orNull)
      .build()
}
