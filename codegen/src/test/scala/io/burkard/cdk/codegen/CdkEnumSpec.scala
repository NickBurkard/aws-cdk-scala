package io.burkard.cdk.codegen

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class CdkEnumSpec extends AnyFlatSpec with Matchers with OptionValues {
  it should "support an enum" in {
    import CdkEnumTestFixtures.Valid._

    CdkEnum
      .build(enumServiceName, enumClass)
      .value mustBe enumCdkEnum
  }

  it should "reject a non-enum" in {
    import CdkEnumTestFixtures.Invalid._

    CdkEnum.build(invalidServiceName, invalidClass) mustBe None
  }
}
