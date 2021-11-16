package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkDocsConfigurationProperty {

  def apply(
    organizationId: String,
    crawlComments: Option[Boolean] = None,
    exclusionPatterns: Option[List[String]] = None,
    fieldMappings: Option[List[_]] = None,
    inclusionPatterns: Option[List[String]] = None,
    useChangeLog: Option[Boolean] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty.Builder)
      .organizationId(organizationId)
      .crawlComments(crawlComments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .useChangeLog(useChangeLog.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
