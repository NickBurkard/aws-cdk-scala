package io.burkard.cdk.services.ses

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AllowListReceiptFilterProps {

  def apply(
    ips: Option[List[String]] = None
  ): software.amazon.awscdk.services.ses.AllowListReceiptFilterProps =
    (new software.amazon.awscdk.services.ses.AllowListReceiptFilterProps.Builder)
      .ips(ips.map(_.asJava).orNull)
      .build()
}
