package io.burkard.cdk.services.kendra

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfluenceBlogConfigurationProperty {

  def apply(
    blogFieldMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty.Builder)
      .blogFieldMappings(blogFieldMappings.map(_.asJava).orNull)
      .build()
}
