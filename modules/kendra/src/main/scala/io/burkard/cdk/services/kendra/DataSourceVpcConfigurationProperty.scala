package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSourceVpcConfigurationProperty {

  def apply(
    subnetIds: List[String],
    securityGroupIds: List[String]
  ): software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty.Builder)
      .subnetIds(subnetIds.asJava)
      .securityGroupIds(securityGroupIds.asJava)
      .build()
}
