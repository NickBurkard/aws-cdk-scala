package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTemplateProps {

  def apply(
    awsAccountId: String,
    templateId: String,
    sourceEntity: software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceEntityProperty,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    versionDescription: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplateProps =
    (new software.amazon.awscdk.services.quicksight.CfnTemplateProps.Builder)
      .awsAccountId(awsAccountId)
      .templateId(templateId)
      .sourceEntity(sourceEntity)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .versionDescription(versionDescription.orNull)
      .build()
}
